package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_PARFS_MJAVA {
LEX_MJAVA scanner;
  S_PARFS_MJAVA() {
    }
  S_PARFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle24() throws Exception {

    //declaration
    S_PARF_MJAVA x_2 = new S_PARF_MJAVA(scanner) ;
    S_PARFSX_MJAVA x_3 = new S_PARFSX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle23() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_parf : // 1318
        regle23 () ;
      break ;
      case LEX_MJAVA.token_int : // 1330
        regle24 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1331
        regle24 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1356
        regle24 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
