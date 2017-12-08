package scripts.wastedbro.api.tree_framework;

/**
 * @author Wastedbro
 */
public abstract class ProcessNode implements INode
{
    @Override
    public INode getValidNode()
    {
        return this;
    }

    @Override
    public abstract String getStatus();

    @Override
    public abstract void execute();
}
