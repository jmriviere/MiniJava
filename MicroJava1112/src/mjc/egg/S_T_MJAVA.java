package mjc.egg;
public class S_T_MJAVA {
LEX_MJAVA scanner;
  S_T_MJAVA() {
    }
  S_T_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle56() throws Exception {

    //declaration
    S_F_MJAVA x_2 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_3 = new S_TX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle56 () ;
  }
  }
