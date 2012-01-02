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
      case LEX_MJAVA.token_mult : // 16083
        regle74 () ;
      break ;
      case LEX_MJAVA.token_div : // 16084
        regle74 () ;
      break ;
      case LEX_MJAVA.token_mod : // 16085
        regle74 () ;
      break ;
      case LEX_MJAVA.token_et : // 16086
        regle74 () ;
      break ;
      case LEX_MJAVA.token_plus : // 16080
        regle74 () ;
      break ;
      case LEX_MJAVA.token_moins : // 16081
        regle74 () ;
      break ;
      case LEX_MJAVA.token_ou : // 16082
        regle74 () ;
      break ;
      case LEX_MJAVA.token_inf : // 16074
        regle74 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 16075
        regle74 () ;
      break ;
      case LEX_MJAVA.token_sup : // 16076
        regle74 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 16077
        regle74 () ;
      break ;
      case LEX_MJAVA.token_eg : // 16078
        regle74 () ;
      break ;
      case LEX_MJAVA.token_neg : // 16079
        regle74 () ;
      break ;
      case LEX_MJAVA.token_affect : // 16061
        regle74 () ;
      break ;
      case LEX_MJAVA.token_virg : // 16058
        regle74 () ;
      break ;
      case LEX_MJAVA.token_pv : // 16059
        regle74 () ;
      break ;
      case LEX_MJAVA.token_parf : // 16053
        regle74 () ;
      break ;
      case LEX_MJAVA.token_pt : // 16060
        regle75 () ;
      break ;
      case LEX_MJAVA.token_paro : // 16052
        regle76 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
