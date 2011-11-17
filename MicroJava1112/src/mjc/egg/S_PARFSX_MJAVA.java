package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_PARFSX_MJAVA {
LEX_MJAVA scanner;
  S_PARFSX_MJAVA() {
    }
  S_PARFSX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle25() throws Exception {

    //declaration
    //appel
  }
  private void regle26() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_PARF_MJAVA x_3 = new S_PARF_MJAVA(scanner) ;
    S_PARFSX_MJAVA x_4 = new S_PARFSX_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_virg);
    x_3.analyser() ;
    x_4.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_parf : // 1318
        regle25 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1323
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
