package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_F_MJAVA {
LEX_MJAVA scanner;
  S_F_MJAVA() {
    }
  S_F_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle71() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_parf);
  }
  private void regle72() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_TYPE_MJAVA x_3 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_5 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_nouveau);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
  }
  private void regle63() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_entier);
  }
  private void regle73() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_3 = new S_Q_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_ident);
    x_3.analyser() ;
  }
  private void regle66() throws Exception {

    //declaration
    S_OPUN_MJAVA x_2 = new S_OPUN_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle64() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_vrai);
  }
  private void regle65() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_faux);
  }
  private void regle70() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_null);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_entier : // 11499
        regle63 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 11497
        regle64 () ;
      break ;
      case LEX_MJAVA.token_faux : // 11498
        regle65 () ;
      break ;
      case LEX_MJAVA.token_plus : // 11489
        regle66 () ;
      break ;
      case LEX_MJAVA.token_moins : // 11490
        regle66 () ;
      break ;
      case LEX_MJAVA.token_non : // 11496
        regle66 () ;
      break ;
      case LEX_MJAVA.token_null : // 11482
        regle70 () ;
      break ;
      case LEX_MJAVA.token_paro : // 11461
        regle71 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 11481
        regle72 () ;
      break ;
      case LEX_MJAVA.token_ident : // 11500
        regle73 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
