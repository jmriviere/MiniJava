package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ENTITES_MJAVA {
LEX_MJAVA scanner;
  S_ENTITES_MJAVA() {
    }
  S_ENTITES_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle1() throws Exception {

    //declaration
    //appel
  }
  private void regle3() throws Exception {

    //declaration
    S_DEFINTERFACE_MJAVA x_3 = new S_DEFINTERFACE_MJAVA(scanner) ;
    S_ENTITES_MJAVA x_4 = new S_ENTITES_MJAVA(scanner) ;
    //appel
      action_tds_3(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle2() throws Exception {

    //declaration
    S_DEFCLASSE_MJAVA x_3 = new S_DEFCLASSE_MJAVA(scanner) ;
    S_ENTITES_MJAVA x_4 = new S_ENTITES_MJAVA(scanner) ;
    //appel
      action_tds_2(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_tds_3(S_DEFINTERFACE_MJAVA x_3, S_ENTITES_MJAVA x_4) throws Exception {
try {
// instructions
x_3.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tds_2(S_DEFCLASSE_MJAVA x_3, S_ENTITES_MJAVA x_4) throws Exception {
try {
// instructions
x_3.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.EOF :
        regle1 () ;
      break ;
      case LEX_MJAVA.token_classe : // 106
        regle2 () ;
      break ;
      case LEX_MJAVA.token_interface : // 107
        regle3 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
