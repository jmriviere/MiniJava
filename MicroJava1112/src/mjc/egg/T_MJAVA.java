package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.lex.*;
public class T_MJAVA {
  LEX_MJAVA att_scanner;
  String att_txt;
  LEX_MJAVA scanner;
  private String txt;
  public String getTxt(){return txt;}
  public T_MJAVA(LEX_MJAVA scanner ) {
    this.scanner = scanner ;
    this.att_scanner = scanner ;
    }
  public void analyser(int t) throws EGGException {
    scanner.lit ( 1 ) ;
    txt = scanner.fenetre[0].getNom() ;
    att_txt = txt ;
    scanner.accepter_sucre ( t ) ;
    }
    }
