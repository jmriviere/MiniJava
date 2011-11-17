package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
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
      case LEX_MJAVA.token_entier : // 1355
        regle77 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1353
        regle77 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1354
        regle77 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1345
        regle77 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1346
        regle77 () ;
      break ;
      case LEX_MJAVA.token_non : // 1352
        regle77 () ;
      break ;
      case LEX_MJAVA.token_null : // 1338
        regle77 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1317
        regle77 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1337
        regle77 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1356
        regle77 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1318
        regle78 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
