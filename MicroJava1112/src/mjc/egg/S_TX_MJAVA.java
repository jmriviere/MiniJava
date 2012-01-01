package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_TX_MJAVA {
LEX_MJAVA scanner;
  S_TX_MJAVA() {
    }
  S_TX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle58() throws Exception {

    //declaration
    //appel
  }
  private void regle57() throws Exception {

    //declaration
    S_OPMUL_MJAVA x_2 = new S_OPMUL_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_4 = new S_TX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 45
        regle57 () ;
      break ;
      case LEX_MJAVA.token_div : // 46
        regle57 () ;
      break ;
      case LEX_MJAVA.token_mod : // 47
        regle57 () ;
      break ;
      case LEX_MJAVA.token_et : // 48
        regle57 () ;
      break ;
      case LEX_MJAVA.token_plus : // 42
        regle58 () ;
      break ;
      case LEX_MJAVA.token_moins : // 43
        regle58 () ;
      break ;
      case LEX_MJAVA.token_ou : // 44
        regle58 () ;
      break ;
      case LEX_MJAVA.token_inf : // 36
        regle58 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 37
        regle58 () ;
      break ;
      case LEX_MJAVA.token_sup : // 38
        regle58 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 39
        regle58 () ;
      break ;
      case LEX_MJAVA.token_eg : // 40
        regle58 () ;
      break ;
      case LEX_MJAVA.token_neg : // 41
        regle58 () ;
      break ;
      case LEX_MJAVA.token_affect : // 23
        regle58 () ;
      break ;
      case LEX_MJAVA.token_virg : // 20
        regle58 () ;
      break ;
      case LEX_MJAVA.token_pv : // 21
        regle58 () ;
      break ;
      case LEX_MJAVA.token_parf : // 15
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
