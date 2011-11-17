package mjc.egg;
public class S_ES_MJAVA {
LEX_MJAVA scanner;
  S_ES_MJAVA() {
    }
  S_ES_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle42() throws Exception {

    //declaration
    S_T_MJAVA x_2 = new S_T_MJAVA(scanner) ;
    S_ESX_MJAVA x_3 = new S_ESX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle42 () ;
  }
  }
