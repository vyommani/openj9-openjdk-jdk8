/*
 * ===========================================================================
 * (c) Copyright IBM Corp. 2018, 2018 All Rights Reserved
 * ===========================================================================
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, see <http://www.gnu.org/licenses/>.
 *
 * ===========================================================================
 */

package sun.security.provider;

abstract class NativeSHA5 {

    /**
     * Native SHA-512 implementation class.
     */
    public static final class SHA512 extends NativeDigest {

        public SHA512() {
            super("SHA-512", 64, 4);
        }
    }

    /**
     * Native SHA-384 implementation class.
     */
    public static final class SHA384 extends NativeDigest {

        public SHA384() {
            super("SHA-384", 48, 3);
        }
    }
}