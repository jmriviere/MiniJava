package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFS_MJAVA {
LEX_MJAVA scanner;
  S_DEFS_MJAVA() {
    }
  S_DEFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_nbAttr;
  int att_hnbAttr;
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle13() throws Exception {

    //declaration
    S_DEF_MJAVA x_3 = new S_DEF_MJAVA(scanner) ;
    S_DEFS_MJAVA x_5 = new S_DEFS_MJAVA(scanner) ;
    //appel
      action_auto_inh_13(x_3, x_5);
      action_tds_13(x_3, x_5);
    x_3.analyser() ;
      action_attr_13(x_3, x_5);
    x_5.analyser() ;
      action_attr2_13(x_3, x_5);
  }
  private void regle12() throws Exception {

    //declaration
    //appel
      action_attr_12();
  }
private void action_attr_13(S_DEF_MJAVA x_3, S_DEFS_MJAVA x_5) throws Exception {
try {
// instructions
x_5.att_hnbAttr=x_3.att_nbAttr;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr2_13(S_DEF_MJAVA x_3, S_DEFS_MJAVA x_5) throws Exception {
try {
// instructions
this.att_nbAttr=x_3.att_nbAttr+x_5.att_nbAttr;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tds_13(S_DEF_MJAVA x_3, S_DEFS_MJAVA x_5) throws Exception {
try {
// instructions
x_3.att_tds=this.att_tds;
x_3.att_hnbAttr=this.att_hnbAttr;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr_12() throws Exception {
try {
// instructions
this.att_nbAttr=this.att_hnbAttr;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_13(S_DEF_MJAVA x_3, S_DEFS_MJAVA x_5) throws Exception {
try {
// instructions
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 11464
        regle12 () ;
      break ;
      case LEX_MJAVA.token_int : // 11474
        regle13 () ;
      break ;
      case LEX_MJAVA.token_bool : // 11475
        regle13 () ;
      break ;
      case LEX_MJAVA.token_ident : // 11500
        regle13 () ;
      break ;
      case LEX_MJAVA.token_void : // 11473
        regle13 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
