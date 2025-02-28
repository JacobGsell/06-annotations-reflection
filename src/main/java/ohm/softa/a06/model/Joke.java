package ohm.softa.a06.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/9/17.
 */
public final class Joke {
	@SerializedName("id")
	private int number;

	@SerializedName("joke")
	private String content;

	@SerializedName("categories")
	private List<String> rubrics;

	public int getNumber() {
		return number;
	}

	public String getContent() {
		return content;
	}

	public Joke() {
		number = -1;
		content = "Not correctly deserialized";
		rubrics = new LinkedList<>();
	}

	public void setNumber()
	{
		this.number = number;
	}

	public void setContent()
	{
		this.content = content;
	}

	public void setRubrics()
	{
		this.rubrics = rubrics;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (!(o instanceof Joke)) return false;

		Joke joke1 = (Joke) o;

		return new EqualsBuilder()
				.append(getNumber(), joke1.getNumber())
				.append(getContent(), joke1.getContent())
				.append(rubrics, joke1.rubrics)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(getNumber())
				.append(getContent())
				.append(rubrics)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("number", number)
				.append("content", content)
				.append("rubrics", rubrics)
				.toString();
	}
}
