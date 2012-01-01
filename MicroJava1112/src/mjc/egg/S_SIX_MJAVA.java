package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
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
    S_BLOC_MJAVA x_4 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_sinon);
      action_tds_35(x_4);
    x_4.analyser() ;
  }
private void action_tds_35(S_BLOC_MJAVA x_4) throws Exception {
try {
// instructions
x_4.att_tds= new TDS();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_sinon : // 11472
        regle35 () ;
      break ;
      case LEX_MJAVA.token_int : // 11474
        regle36 () ;
      break ;
      case LEX_MJAVA.token_bool : // 11475
        regle36 () ;
      break ;
      case LEX_MJAVA.token_ident : // 11500
        regle36 () ;
      break ;
      case LEX_MJAVA.token_entier : // 11499
        regle36 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 11497
        regle36 () ;
      break ;
      case LEX_MJAVA.token_faux : // 11498
        regle36 () ;
      break ;
      case LEX_MJAVA.token_plus : // 11489
        regle36 () ;
      break ;
      case LEX_MJAVA.token_moins : // 11490
        regle36 () ;
      break ;
      case LEX_MJAVA.token_non : // 11496
        regle36 () ;
      break ;
      case LEX_MJAVA.token_null : // 11482
        regle36 () ;
      break ;
      case LEX_MJAVA.token_paro : // 11461
        regle36 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 11481
        regle36 () ;
      break ;
      case LEX_MJAVA.token_aco : // 11463
        regle36 () ;
      break ;
      case LEX_MJAVA.token_si : // 11471
        regle36 () ;
      break ;
      case LEX_MJAVA.token_retour : // 11480
        regle36 () ;
      break ;
      case LEX_MJAVA.token_acf : // 11464
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
