package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_OPMUL_MJAVA {
LEX_MJAVA scanner;
  S_OPMUL_MJAVA() {
    }
  S_OPMUL_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle59() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_mult);
  }
  private void regle60() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_div);
  }
  private void regle62() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_et);
  }
  private void regle61() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_mod);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 1348
        regle59 () ;
      break ;
      case LEX_MJAVA.token_div : // 1349
        regle60 () ;
      break ;
      case LEX_MJAVA.token_mod : // 1350
        regle61 () ;
      break ;
      case LEX_MJAVA.token_et : // 1351
        regle62 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
