package ohm.softa.a08.filter;

public class FilterFactory {

	private static final NoFilter noFilter = new NoFilter();
	private static final CategoryFilter categoryFilter = new CategoryFilter("vegetarisch");
	private static final NotesFilter notesFilterPork = new NotesFilter("Schwein");
	private static final NotesFilter notesFilterSoy = new NotesFilter("Soja");

	public static MealsFilter getStrategy(FilterType type) {
		switch (type) {
			case VEGETARIAN:
				return categoryFilter;
			case NO_PORK:
				return notesFilterPork;
			case NO_SOY:
				return notesFilterSoy;
			default: // ALL
				return noFilter;
		}
	}

	public enum FilterType {
		ALL, VEGETARIAN, NO_PORK, NO_SOY
	}
}
