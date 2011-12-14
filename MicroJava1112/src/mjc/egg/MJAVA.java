package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.EGGException;
import mg.egg.eggc.compiler.libjava.ISourceUnit;
import mg.egg.eggc.compiler.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.compiler.libjava.problem.IProblemReporter;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import mg.egg.eggc.compiler.libjava.problem.ProblemSeverities;
import mg.egg.eggc.compiler.libjava.messages.NLS;
public class MJAVA {
  LEX_MJAVA scanner;
  protected IProblemReporter problemReporter;
    private S_PROGRAMME_MJAVA axiome ;
    public  S_PROGRAMME_MJAVA getAxiom(){return axiome;}
  public MJAVA(IProblemReporter pr){
	   this.problemReporter = pr;
  }
  public void compile(ISourceUnit cu) throws Exception {
    try{
      LEX_CONTEXTE contexte;
      contexte = new LEX_CONTEXTE(cu);
      scanner = new LEX_MJAVA(problemReporter, contexte, 3);
      scanner.analyseur.fromContext(contexte);
      att_scanner = scanner;
      axiome = new S_PROGRAMME_MJAVA(scanner);
      axiome.att_scanner = this.att_scanner ;
      axiome.att_source = this.att_source ;
      axiome.analyser() ;
      scanner.accepter_fds() ;
    }catch (EGGException e){
      problemReporter.handle(e.getCategory(), e.getCode(),0, NLS.bind(e.getId(),e.getArgs()),ProblemSeverities.Error,0,0,e.getArgs());
    }
    }
  MJAVASourceFile att_source;
  public void set_source(MJAVASourceFile a_source){
    att_source = a_source;
  }
  public MJAVASourceFile get_source(){
    return att_source;
  }
  LEX_MJAVA att_scanner;
  public void set_scanner(LEX_MJAVA a_scanner){
    att_scanner = a_scanner;
  }
  public LEX_MJAVA get_scanner(){
    return att_scanner;
  }
  }
