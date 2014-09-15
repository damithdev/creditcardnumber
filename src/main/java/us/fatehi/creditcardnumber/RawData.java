/*
 *
 * Credit Card Number
 * https://github.com/sualeh/credit_card_number
 * Copyright (c) 2014, Sualeh Fatehi.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 */
package us.fatehi.creditcardnumber;


import java.io.Serializable;

public interface RawData
  extends Serializable
{

  /**
   * Whether the raw data exceeds the maximum length allowed.
   *
   * @return True if too long
   */
  boolean exceedsMaximumLength();

  /**
   * Raw data.
   *
   * @return Raw data
   */
  String getRawData();

  /**
   * Whether raw data is present.
   *
   * @return True if raw data is available.
   */
  boolean hasRawData();

}
