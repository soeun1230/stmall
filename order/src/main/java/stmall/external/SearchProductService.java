package stmall.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product", url = "${api.url.product}")
public interface SearchProductService {
    @GetMapping(path = "/searchProducts")
    public List<SearchProduct> getSearchProduct();

    @GetMapping(path = "/searchProducts/{id}")
    public SearchProduct getSearchProduct(@PathVariable("id") Long id);
}
