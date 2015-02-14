package KarateChop;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{

        System.out.println(System.getProperty("user.dir"));

        // java version
        ArrayList<Chop> chops = new ArrayList<>();
        chops.add(new RecursiveChop());
        chops.add(new IterateChop());
        chops.add(new Iterate2Chop());

        for (Chop chop: chops) {
            chop.testChop();
        }

        System.out.println("Ok!");

        // javascript version
        JSBridge js = new JSBridge();
        ScriptObjectMirror jso = js.execute();
        System.out.println(jso.getMember("field"));
        jso.callMember("testChop");

        System.out.print("Ok!");
    }

}

class JSBridge {

    public ScriptObjectMirror execute() throws ScriptException, NoSuchMethodException, FileNotFoundException {
        final ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader("JS/KarateChop.js"));
        final Invocable invocable = (Invocable) engine;

        return (ScriptObjectMirror) invocable.invokeFunction("IterateChop");
    }
}