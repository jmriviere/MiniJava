package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEF_MJAVA {
LEX_MJAVA scanner;
  S_DEF_MJAVA() {
    }
  S_DEF_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_nbAttr;
  int att_hnbAttr;
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle19() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_4 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_7 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_ident);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
      action_tds_19(x_2, x_4, x_7);
    x_7.analyser() ;
      action_attr_19(x_2, x_4, x_7);
  }
  private void regle14() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_pv);
      action_attr_14(x_2, x_3);
  }
  private void regle15() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_5 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    S_MCORPS_MJAVA x_8 = new S_MCORPS_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
      action_tds_15(x_2, x_3, x_5, x_8);
    x_8.analyser() ;
      action_attr_15(x_2, x_3, x_5, x_8);
  }
  private void regle16() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_5 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    S_MCORPS_MJAVA x_8 = new S_MCORPS_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_void);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
      action_tds_16(x_3, x_5, x_8);
    x_8.analyser() ;
      action_attr_16(x_3, x_5, x_8);
  }
private void action_tds_19(T_MJAVA x_2, S_PARFS_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// instructions
x_7.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr_19(T_MJAVA x_2, S_PARFS_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// instructions
this.att_nbAttr=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tds_16(T_MJAVA x_3, S_PARFS_MJAVA x_5, S_MCORPS_MJAVA x_8) throws Exception {
try {
// instructions
x_8.att_tds=this.att_tds;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr_14(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// instructions
this.att_nbAttr=1;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tds_15(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_5, S_MCORPS_MJAVA x_8) throws Exception {
try {
// instructions
x_8.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr_16(T_MJAVA x_3, S_PARFS_MJAVA x_5, S_MCORPS_MJAVA x_8) throws Exception {
try {
// instructions
this.att_nbAttr=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_attr_15(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_5, S_MCORPS_MJAVA x_8) throws Exception {
try {
// instructions
this.att_nbAttr=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 27
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 53
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 21
                regle14 () ;
              break ;
              case LEX_MJAVA.token_paro : // 14
                regle15 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
            }
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_int);
        }
      break ;
      case LEX_MJAVA.token_bool : // 28
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 53
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 21
                regle14 () ;
              break ;
              case LEX_MJAVA.token_paro : // 14
                regle15 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
            }
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_bool);
        }
      break ;
      case LEX_MJAVA.token_ident : // 53
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 53
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 21
                regle14 () ;
              break ;
              case LEX_MJAVA.token_paro : // 14
                regle15 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
            }
          break ;
          case LEX_MJAVA.token_paro : // 14
            regle19 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_void : // 26
        regle16 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
