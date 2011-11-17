package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_MCORPS_MJAVA {
LEX_MJAVA scanner;
  S_MCORPS_MJAVA() {
    }
  S_MCORPS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle17() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_pv);
  }
  private void regle18() throws Exception {

    //declaration
    S_BLOC_MJAVA x_2 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_pv : // 1324
        regle17 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1319
        regle18 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
