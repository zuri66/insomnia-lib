package insomnia.json;

import insomnia.builder.BuilderData;

/**
 * Permet de construire un document Json
 * 
 * @author zuri
 * 
 */
abstract public class JsonBuilder extends BuilderData
{

	public JsonBuilder()
	{

	}

	public JsonBuilder(Json d)
	{
		setJson(d);
	}

	public void setJson(Json d)
	{
		setBuilded(d);
	}

	protected Json getJson()
	{
		return (Json) getBuilded();
	}

	@Override
	abstract public void build() throws JsonBuilderException;

	@Override
	abstract public Json newBuild() throws JsonBuilderException;
}
