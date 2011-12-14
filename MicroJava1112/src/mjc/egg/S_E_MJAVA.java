package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_E_MJAVA {
LEX_MJAVA scanner;
  S_E_MJAVA() {
    }
  S_E_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle38() throws Exception {

    //declaration
    S_ER_MJAVA x_2 = new S_ER_MJAVA(scanner) ;
    S_AFFX_MJAVA x_3 = new S_AFFX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle38 () ;
  }
  }
