package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ARGS_MJAVA {
LEX_MJAVA scanner;
  S_ARGS_MJAVA() {
    }
  S_ARGS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle77() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    S_ARGSX_MJAVA x_3 = new S_ARGSX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle78() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_entier : // 52
        regle77 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 50
        regle77 () ;
      break ;
      case LEX_MJAVA.token_faux : // 51
        regle77 () ;
      break ;
      case LEX_MJAVA.token_plus : // 42
        regle77 () ;
      break ;
      case LEX_MJAVA.token_moins : // 43
        regle77 () ;
      break ;
      case LEX_MJAVA.token_non : // 49
        regle77 () ;
      break ;
      case LEX_MJAVA.token_null : // 35
        regle77 () ;
      break ;
      case LEX_MJAVA.token_paro : // 14
        regle77 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 34
        regle77 () ;
      break ;
      case LEX_MJAVA.token_ident : // 53
        regle77 () ;
      break ;
      case LEX_MJAVA.token_parf : // 15
        regle78 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
