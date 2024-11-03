package fr.groupez.api.placeholder;
@FunctionalInterface
public interface ReturnConsumer<T, G> {

	G accept(T t);
	
}