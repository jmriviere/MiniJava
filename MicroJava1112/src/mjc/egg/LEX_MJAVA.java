package mjc.egg;
import java.util.Arrays;
import mg.egg.eggc.compiler.libjava.EGGException;
import mg.egg.eggc.compiler.libjava.messages.NLS;
import mg.egg.eggc.compiler.libjava.lex.LEXICAL4;
import mg.egg.eggc.compiler.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.compiler.libjava.problem.IProblemReporter;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import mg.egg.eggc.compiler.libjava.problem.ProblemSeverities;
import mjc.compiler.*;
import mjc.gc.*;
public class LEX_MJAVA extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_faux = 1 ;
 public static final int token_sinon = 2 ;
 public static final int token_void = 3 ;
 public static final int token_mod = 4 ;
 public static final int token_mult = 5 ;
 public static final int token_eg = 6 ;
 public static final int token_null = 7 ;
 public static final int token_interface = 8 ;
 public static final int token_ident = 9 ;
 public static final int token_div = 10 ;
 public static final int token_pv = 11 ;
 public static final int token_vrai = 12 ;
 public static final int token_pt = 13 ;
 public static final int token_int = 14 ;
 public static final int token_nouveau = 15 ;
 public static final int token_aco = 16 ;
 public static final int token_inf = 17 ;
 public static final int token_acf = 18 ;
 public static final int token_ou = 19 ;
 public static final int token_etend = 20 ;
 public static final int token_bool = 21 ;
 public static final int token_moins = 22 ;
 public static final int token_neg = 23 ;
 public static final int token_implemente = 24 ;
 public static final int token_affect = 25 ;
 public static final int token_retour = 26 ;
 public static final int token_virg = 27 ;
 public static final int token_entier = 28 ;
 public static final int token_si = 29 ;
 public static final int token_paro = 30 ;
 public static final int token_cro = 31 ;
 public static final int token_classe = 32 ;
 public static final int token_sup = 33 ;
 public static final int token_separateur = 34 ;
 public static final int token_comm = 35 ;
 public static final int token_parf = 36 ;
 public static final int token_crf = 37 ;
 public static final int token_supeg = 38 ;
 public static final int token_plus = 39 ;
 public static final int token_non = 40 ;
 public static final int token_infeg = 41 ;
 public static final int token_et = 42 ;
  static final int token_autre = 43 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,{"faux"},
{"sinon"},
{"void"},
{"mod"},
{"mult"},
{"eg"},
{"null"},
{"interface"},
    {"ident"} ,
{"div"},
{"pv"},
{"vrai"},
{"pt"},
{"int"},
{"nouveau"},
{"aco"},
{"inf"},
{"acf"},
{"ou"},
{"etend"},
{"bool"},
{"moins"},
{"neg"},
{"implemente"},
{"affect"},
{"retour"},
{"virg"},
    {"entier"} ,
{"si"},
{"paro"},
{"cro"},
{"classe"},
{"sup"},
    {"separateur"} ,
    {"comm"} ,
{"parf"},
{"crf"},
{"supeg"},
{"plus"},
{"non"},
{"infeg"},
{"et"},
  } ;
  private int [] separateurs = { 
token_separateur
, token_comm
    } ;
  public int[] getSeparateurs(){
    return separateurs;
    }
  private int [] comments = { 
    } ;
  public int[] getComments(){
    return comments;
    }
  private int le_comment = -1;
  public int getComment(){
    return le_comment;
    }
  public LEX_MJAVA(IProblemReporter pr, LEX_CONTEXTE lc, int k) {
    super(pr, lc,k);
    dernier_accepte = 0 ;
    analyseur = new JLEX_MJAVA();
  }
  public void setSource ( LEXICAL4 scanner) throws EGGException{
    scanner.analyseur.toContext(scanner.contexte);
    analyseur.fromContext(scanner.contexte);
  }
  public void setReader ( LEXICAL4 scanner) {
    scanner.analyseur.setReader(scanner.contexte.source);
  }
  public void accepter_sucre ( int t ) throws EGGException {
    if ( fenetre[0].code == t ) {
      dernier_accepte = fenetre[0].ligne ;
      recovery = false;
      decaler () ;
    }else {
      _interrompre(IProblem.Syntax,getBeginLine(), IMJAVAMessages.id_MJAVA_expected_token, MJAVAMessages.MJAVA_expected_token,new Object[]{fenetre[0].getNom(), Arrays.asList(tokenImages[t])});
    }
  }
  public void accepter_fds() throws EGGException {
    lit ( 1 ) ;
    if ( fenetre[0].code != EOF ) {
      _interrompre(IProblem.Syntax,getBeginLine(), IMJAVAMessages.id_MJAVA_expected_token, MJAVAMessages.MJAVA_expected_eof, new Object[]{fenetre[0].getNom()});
      }
     else {
      dernier_accepte = fenetre[0].ligne ;
      }
    }
  public int ligneDepart () {
    return getBeginLine() + getEndLine() ;
    }
  public void _interrompre (int cat,  int line, int id,  String c , Object [] m )  {
      //recovery = true;
      recovery = false;
      contexte.errors++;
        problemReporter.handle(cat, id,line  , NLS.bind(c,m), getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Error,m);
    }
    public void _signaler ( int cat, int line, int id, String c , Object [] m )  {
        problemReporter.handle(cat , id, line  , NLS.bind(c,m),getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Warning,m);
    }
  }
