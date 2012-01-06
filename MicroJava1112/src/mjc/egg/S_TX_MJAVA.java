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
      case LEX_MJAVA.token_mult : // 122
        regle57 () ;
      break ;
      case LEX_MJAVA.token_div : // 123
        regle57 () ;
      break ;
      case LEX_MJAVA.token_mod : // 124
        regle57 () ;
      break ;
      case LEX_MJAVA.token_et : // 125
        regle57 () ;
      break ;
      case LEX_MJAVA.token_plus : // 119
        regle58 () ;
      break ;
      case LEX_MJAVA.token_moins : // 120
        regle58 () ;
      break ;
      case LEX_MJAVA.token_ou : // 121
        regle58 () ;
      break ;
      case LEX_MJAVA.token_inf : // 113
        regle58 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 114
        regle58 () ;
      break ;
      case LEX_MJAVA.token_sup : // 115
        regle58 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 116
        regle58 () ;
      break ;
      case LEX_MJAVA.token_eg : // 117
        regle58 () ;
      break ;
      case LEX_MJAVA.token_neg : // 118
        regle58 () ;
      break ;
      case LEX_MJAVA.token_affect : // 100
        regle58 () ;
      break ;
      case LEX_MJAVA.token_virg : // 97
        regle58 () ;
      break ;
      case LEX_MJAVA.token_pv : // 98
        regle58 () ;
      break ;
      case LEX_MJAVA.token_parf : // 92
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
