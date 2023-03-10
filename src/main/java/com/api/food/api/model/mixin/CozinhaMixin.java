package com.api.food.api.model.mixin;

import java.util.List;

import com.api.food.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CozinhaMixin {
	
	@JsonIgnore
	private List<Restaurante> restaurantes;
	
}
