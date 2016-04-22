package rocks.inspectit.server.cache.impl;

import rocks.inspectit.server.cache.AbstractObjectSizesIbm;

/**
 * The object size class for 64bit IBM JVM. Works only with Java 7.
 *
 * @author Ivan Senic
 *
 */
public class ObjectSizes64BitsIbm extends AbstractObjectSizesIbm {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getReferenceSize() {
		return 8;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getSizeOfObjectHeader() {
		return 16;
	}

}
