package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_PROGRAMME_MJAVA {
LEX_MJAVA scanner;
  S_PROGRAMME_MJAVA() {
    }
  S_PROGRAMME_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  MJAVASourceFile att_source;
  LEX_MJAVA att_scanner;
  AbstractMachine glob_0_machine;
  TDS glob_0_t;
  private void regle0() throws Exception {

    //declaration
    S_ENTITES_MJAVA x_3 = new S_ENTITES_MJAVA(scanner) ;
    //appel
      action_init_0(x_3);
    x_3.analyser() ;
      action_gen_0(x_3);
  }
private void action_gen_0(S_ENTITES_MJAVA x_3) throws Exception {
try {
// locales
// instructions
    glob_0_machine.writeCode(this.att_source.getFileName(), "");
System.out.print(""+"tds "+glob_0_t);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_init_0(S_ENTITES_MJAVA x_3) throws Exception {
try {
// locales
// instructions
glob_0_machine=this.att_source.getMachine();
glob_0_t= new TDS();
x_3.att_tds=glob_0_t;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_classe : // 11476
        regle0 () ;
      break ;
      case LEX_MJAVA.token_interface : // 11477
        regle0 () ;
      break ;
      case LEX_MJAVA.EOF :
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
