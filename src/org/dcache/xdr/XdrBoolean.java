/*
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Library General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this program (see the file COPYING.LIB for more
 * details); if not, write to the Free Software Foundation, Inc.,
 * 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package org.dcache.xdr;

import java.io.IOException;

public class XdrBoolean implements XdrAble {

    public static final XdrBoolean True = new XdrBoolean(true);
    public static final XdrBoolean False = new XdrBoolean(false);

    private boolean _value;

    public XdrBoolean() {
    }

    public XdrBoolean(boolean value) {
        _value = value;
    }

    /**
     * Returns the value of this <code>XdrBoolean</code> object as a boolean primitive.
     * @return the primitive <code>boolean</code> value of this object.
     */
    public boolean booleanValue() {
        return _value;
    }
    public void xdrDecode(XdrDecodingStream xdr) throws OncRpcException, IOException {
        _value = xdr.xdrDecodeBoolean();
    }

    public void xdrEncode(XdrEncodingStream xdr) throws OncRpcException, IOException {
        xdr.xdrEncodeBoolean(_value);
    }

}
