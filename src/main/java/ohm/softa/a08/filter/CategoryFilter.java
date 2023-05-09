package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;

public class CategoryFilter extends FilterBase {

	private final String[] options;

	public CategoryFilter(String... options) {
		this.options = options;
	}

	@Override
	protected boolean include(Meal m) {
		return Arrays.asList(options)
			.contains(m.getCategory());
	}
}
