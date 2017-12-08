package scripts.wastedbro.api.tree_framework;


/**
 * @author Wastedbro
 */
public class GenericDecisionNode extends DecisionNode
{
    ICondition condition;

    public GenericDecisionNode(ICondition condition)
    {
        this.condition = condition;
    }

    public GenericDecisionNode(ICondition condition, INode onTrueNode, INode onFalseNode)
    {
        this.condition = condition;
        addOnTrueNode(onTrueNode);
        addOnFalseNode(onFalseNode);
    }

    @Override
    public boolean isValid()
    {
        return condition.isValid();
    }
}
