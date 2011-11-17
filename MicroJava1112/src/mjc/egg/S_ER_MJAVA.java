package mjc.egg;
public class S_ER_MJAVA {
LEX_MJAVA scanner;
  S_ER_MJAVA() {
    }
  S_ER_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle41() throws Exception {

    //declaration
    S_ES_MJAVA x_2 = new S_ES_MJAVA(scanner) ;
    S_ERX_MJAVA x_3 = new S_ERX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle41 () ;
  }
  }
