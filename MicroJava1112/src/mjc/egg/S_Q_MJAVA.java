package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_Q_MJAVA {
LEX_MJAVA scanner;
  S_Q_MJAVA() {
    }
  S_Q_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle76() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_3 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_5 = new S_Q_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_parf);
    x_5.analyser() ;
  }
  private void regle75() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_4 = new S_Q_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_pt);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
  }
  private void regle74() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 122
        regle74 () ;
      break ;
      case LEX_MJAVA.token_div : // 123
        regle74 () ;
      break ;
      case LEX_MJAVA.token_mod : // 124
        regle74 () ;
      break ;
      case LEX_MJAVA.token_et : // 125
        regle74 () ;
      break ;
      case LEX_MJAVA.token_plus : // 119
        regle74 () ;
      break ;
      case LEX_MJAVA.token_moins : // 120
        regle74 () ;
      break ;
      case LEX_MJAVA.token_ou : // 121
        regle74 () ;
      break ;
      case LEX_MJAVA.token_inf : // 113
        regle74 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 114
        regle74 () ;
      break ;
      case LEX_MJAVA.token_sup : // 115
        regle74 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 116
        regle74 () ;
      break ;
      case LEX_MJAVA.token_eg : // 117
        regle74 () ;
      break ;
      case LEX_MJAVA.token_neg : // 118
        regle74 () ;
      break ;
      case LEX_MJAVA.token_affect : // 100
        regle74 () ;
      break ;
      case LEX_MJAVA.token_virg : // 97
        regle74 () ;
      break ;
      case LEX_MJAVA.token_pv : // 98
        regle74 () ;
      break ;
      case LEX_MJAVA.token_parf : // 92
        regle74 () ;
      break ;
      case LEX_MJAVA.token_pt : // 99
        regle75 () ;
      break ;
      case LEX_MJAVA.token_paro : // 91
        regle76 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
