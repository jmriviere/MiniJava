package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_INST_MJAVA {
LEX_MJAVA scanner;
  S_INST_MJAVA() {
    }
  S_INST_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle37() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_pv);
  }
  private void regle31() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_AFFX_MJAVA x_4 = new S_AFFX_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_pv);
  }
  private void regle32() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_pv);
  }
  private void regle33() throws Exception {

    //declaration
    S_BLOC_MJAVA x_2 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_33(x_2);
    x_2.analyser() ;
  }
  private void regle34() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_7 = new S_BLOC_MJAVA(scanner) ;
    S_SIX_MJAVA x_8 = new S_SIX_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_si);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
      action_tds_34(x_4, x_7, x_8);
    x_7.analyser() ;
    x_8.analyser() ;
  }
private void action_tds_34(S_E_MJAVA x_4, S_BLOC_MJAVA x_7, S_SIX_MJAVA x_8) throws Exception {
try {
// instructions
x_7.att_tds= new TDS();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_33(S_BLOC_MJAVA x_2) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 11474
        regle31 () ;
      break ;
      case LEX_MJAVA.token_bool : // 11475
        regle31 () ;
      break ;
      case LEX_MJAVA.token_ident : // 11500
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 11500
            regle31 () ;
          break ;
          case LEX_MJAVA.token_pt : // 11469
            regle32 () ;
          break ;
          case LEX_MJAVA.token_paro : // 11461
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mult : // 11492
            regle32 () ;
          break ;
          case LEX_MJAVA.token_div : // 11493
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mod : // 11494
            regle32 () ;
          break ;
          case LEX_MJAVA.token_et : // 11495
            regle32 () ;
          break ;
          case LEX_MJAVA.token_plus : // 11489
            regle32 () ;
          break ;
          case LEX_MJAVA.token_moins : // 11490
            regle32 () ;
          break ;
          case LEX_MJAVA.token_ou : // 11491
            regle32 () ;
          break ;
          case LEX_MJAVA.token_inf : // 11483
            regle32 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 11484
            regle32 () ;
          break ;
          case LEX_MJAVA.token_sup : // 11485
            regle32 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 11486
            regle32 () ;
          break ;
          case LEX_MJAVA.token_eg : // 11487
            regle32 () ;
          break ;
          case LEX_MJAVA.token_neg : // 11488
            regle32 () ;
          break ;
          case LEX_MJAVA.token_affect : // 11470
            regle32 () ;
          break ;
          case LEX_MJAVA.token_pv : // 11468
            regle32 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_entier : // 11499
        regle32 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 11497
        regle32 () ;
      break ;
      case LEX_MJAVA.token_faux : // 11498
        regle32 () ;
      break ;
      case LEX_MJAVA.token_plus : // 11489
        regle32 () ;
      break ;
      case LEX_MJAVA.token_moins : // 11490
        regle32 () ;
      break ;
      case LEX_MJAVA.token_non : // 11496
        regle32 () ;
      break ;
      case LEX_MJAVA.token_null : // 11482
        regle32 () ;
      break ;
      case LEX_MJAVA.token_paro : // 11461
        regle32 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 11481
        regle32 () ;
      break ;
      case LEX_MJAVA.token_aco : // 11463
        regle33 () ;
      break ;
      case LEX_MJAVA.token_si : // 11471
        regle34 () ;
      break ;
      case LEX_MJAVA.token_retour : // 11480
        regle37 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
