package cucumber.runtime.converters;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;

/**
 * Subclass that exposes the wrapped converter
 */
public class SingleValueConverterWrapperExt extends SingleValueConverterWrapper {
    private final SingleValueConverter converter;

    public SingleValueConverterWrapperExt(SingleValueConverter converter) {
        super(converter);
        this.converter = converter;
    }

    public SingleValueConverter getConverter() {
        return converter;
    }
}