package scripts.wastedbro.api.tree_framework;

/**
 * @author Wastedbro
 */
public interface INode
{
    INode getValidNode();

    String getStatus();

    void execute();
}
