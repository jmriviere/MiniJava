package mjc.egg;
public class S_PARF_MJAVA {
LEX_MJAVA scanner;
  S_PARF_MJAVA() {
    }
  S_PARF_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle27() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
  }
  public void analyser () throws Exception {
    regle27 () ;
  }
  }
