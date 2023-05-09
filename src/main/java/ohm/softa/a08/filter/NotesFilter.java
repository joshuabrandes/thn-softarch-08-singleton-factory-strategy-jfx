package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

public class NotesFilter extends FilterBase {

	private final String[] options;

	public NotesFilter(String... options) {
		this.options = options;
	}

	@Override
	protected boolean include(Meal m) {
		var result = true;

		for (String option : options) {
			if (!m.getNotes().contains(option))
				return false;
		}

		return result;
	}
}
