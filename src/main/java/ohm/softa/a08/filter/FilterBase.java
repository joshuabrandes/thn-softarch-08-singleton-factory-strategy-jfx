package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

import java.util.List;
import java.util.stream.Collectors;

public abstract class FilterBase implements MealsFilter {
	protected abstract boolean include(Meal m);

	@Override
	public final List<Meal> filter(List<Meal> meals) {
		return meals.stream()
			.filter(this::include)
			.collect(Collectors.toList());
	}
}
