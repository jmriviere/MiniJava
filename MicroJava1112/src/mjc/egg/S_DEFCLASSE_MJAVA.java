package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFCLASSE_MJAVA {
LEX_MJAVA scanner;
  S_DEFCLASSE_MJAVA() {
    }
  S_DEFCLASSE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle4() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_SUPER_MJAVA x_4 = new S_SUPER_MJAVA(scanner) ;
    S_CORPS_MJAVA x_6 = new S_CORPS_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_classe);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
      action_attr_4(x_3, x_4, x_6);
    x_6.analyser() ;
      action_tds_4(x_3, x_4, x_6);
  }
private void action_tds_4(T_MJAVA x_3, S_SUPER_MJAVA x_4, S_CORPS_MJAVA x_6) throws Exception {
try {
// locales
INFO loc_info;
TYPE loc_t;
// instructions
loc_info=this.att_tds.chercherGlobalement(x_3.att_txt);
if (loc_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_err_ident_already_known, MJAVAMessages.err_ident_already_known,new Object[]{""+x_3.att_txt});

}
else {
loc_t= new DTYPE(x_3.att_txt, x_6.att_nbAttr);
    this.att_tds.inserer(x_3.att_txt,  new INFOCLASS(loc_t, false));
}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr_4(T_MJAVA x_3, S_SUPER_MJAVA x_4, S_CORPS_MJAVA x_6) throws Exception {
try {
// instructions
x_6.att_tds=this.att_tds;
x_6.att_hnbAttr=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle4 () ;
  }
  }
