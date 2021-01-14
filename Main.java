import gen.HaveFunLexer;
import gen.HaveFunParser;
import gen.IntHaveFun;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        HaveFunLexer lexer = new HaveFunLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HaveFunParser parser = new HaveFunParser(tokenStream);

        ParseTree tree = parser.prog();

        IntHaveFun interpreter = new IntHaveFun();
        interpreter.visit(tree);
    }
}
