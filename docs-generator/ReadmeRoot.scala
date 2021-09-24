package ${artifactPackage}.docs

import net.jackadull.jackadocs.structure.badges.BadgeGenerators
import net.jackadull.jackadocs.structure.{DocsMetaData, RootChapter}
import ${artifactPackage}.docs.readme.DependencyManagementAndCompatibility

object ReadmeRoot extends RootChapter with BadgeGenerators {
  def title = "${artifactIdWithoutScalaVersionCapitalized}"

  override def contentsBeforeTOC(root:RootChapter) =
<p>{travisCIBadge} {mavenCentralBadge} {scaladocBadge} {coverallsBadge} {codeFactorBadge} {snykBadge}</p>

  def contents(root:RootChapter) =
<p>
  axixfunds
</p>

  override def subChapters = Seq(DependencyManagementAndCompatibility)

  def docsMetaData:DocsMetaData = Main
}
