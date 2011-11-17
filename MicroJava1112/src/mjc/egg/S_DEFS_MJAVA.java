package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_DEFS_MJAVA {
LEX_MJAVA scanner;
  S_DEFS_MJAVA() {
    }
  S_DEFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle13() throws Exception {

    //declaration
    S_DEF_MJAVA x_2 = new S_DEF_MJAVA(scanner) ;
    S_DEFS_MJAVA x_3 = new S_DEFS_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle12() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 1320
        regle12 () ;
      break ;
      case LEX_MJAVA.token_int : // 1330
        regle13 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1331
        regle13 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1356
        regle13 () ;
      break ;
      case LEX_MJAVA.token_void : // 1329
        regle13 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
