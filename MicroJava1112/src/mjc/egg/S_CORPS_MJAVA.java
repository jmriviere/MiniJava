package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_CORPS_MJAVA {
LEX_MJAVA scanner;
  S_CORPS_MJAVA() {
    }
  S_CORPS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_nbAttr;
  int att_hnbAttr;
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle11() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEFS_MJAVA x_4 = new S_DEFS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_11(x_4);
    x_2.analyser(LEX_MJAVA.token_aco);
      action_tds_11(x_4);
    x_4.analyser() ;
      action_attr_11(x_4);
    x_6.analyser(LEX_MJAVA.token_acf);
  }
private void action_attr_11(S_DEFS_MJAVA x_4) throws Exception {
try {
// instructions
this.att_nbAttr=x_4.att_nbAttr;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tds_11(S_DEFS_MJAVA x_4) throws Exception {
try {
// instructions
x_4.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_11(S_DEFS_MJAVA x_4) throws Exception {
try {
// instructions
x_4.att_hnbAttr=this.att_hnbAttr;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle11 () ;
  }
  }
