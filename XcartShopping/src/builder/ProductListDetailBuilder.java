package builder;

import detail.ProductListDetail;

public class ProductListDetailBuilder {
	private String search;

	public ProductListDetailBuilder withSearch(String search) {
		this.search = search;
		return this;
	}

	public ProductListDetail productlistbuild() {
		return new ProductListDetail(search);
	}

}
