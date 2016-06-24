package paprika.analyzer;

import paprika.parser.ObjCParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by Sarra on 28/02/2016.
 */

public class AstPrinter {

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        String ruleName = ObjCParser.ruleNames[ctx.getRuleIndex()];

        for (int i=0;i<indentation;i++) {
            System.out.print("  ");
        }
        System.out.println(ruleName);
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext)element, indentation + 1);
            }
        }
    }

}