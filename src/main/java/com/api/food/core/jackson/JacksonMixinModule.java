package com.api.food.core.jackson;

import org.springframework.stereotype.Component;

import com.api.food.api.model.mixin.CidadeMixin;
import com.api.food.api.model.mixin.CozinhaMixin;
import com.api.food.domain.model.Cidade;
import com.api.food.domain.model.Cozinha;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Component
public class JacksonMixinModule extends SimpleModule {

	private static final long serialVersionUID = 1L;

	public JacksonMixinModule() {
		setMixInAnnotation(Cidade.class, CidadeMixin.class);
		setMixInAnnotation(Cozinha.class, CozinhaMixin.class);
	}
}
