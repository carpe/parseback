/*
 * Copyright 2021 Carpe Data
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package parseback
package render

sealed trait RenderResult extends Product with Serializable

object RenderResult {
  type TokenSequence = List[Either[Parser[_], String]]

  final case class Nonterminal(label: String, branches: List[Parser[_]]) extends RenderResult
  final case class Tokens(contents: TokenSequence) extends RenderResult
}
