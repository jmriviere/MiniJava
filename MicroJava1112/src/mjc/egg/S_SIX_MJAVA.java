package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_SIX_MJAVA {
LEX_MJAVA scanner;
  S_SIX_MJAVA() {
    }
  S_SIX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle36() throws Exception {

    //declaration
    //appel
  }
  private void regle35() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_3 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_sinon);
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_sinon : // 1328
        regle35 () ;
      break ;
      case LEX_MJAVA.token_int : // 1330
        regle36 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1331
        regle36 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1356
        regle36 () ;
      break ;
      case LEX_MJAVA.token_entier : // 1355
        regle36 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1353
        regle36 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1354
        regle36 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1345
        regle36 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1346
        regle36 () ;
      break ;
      case LEX_MJAVA.token_non : // 1352
        regle36 () ;
      break ;
      case LEX_MJAVA.token_null : // 1338
        regle36 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1317
        regle36 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1337
        regle36 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1319
        regle36 () ;
      break ;
      case LEX_MJAVA.token_si : // 1327
        regle36 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1336
        regle36 () ;
      break ;
      case LEX_MJAVA.token_acf : // 1320
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
