!<-- Required for XSLT language -->
<?xml version="1.0" encoding='UTF-8'?>
<xsl:stylesheet xmlns:xsl=
   "http://www.w3.org/1999/XSL/Transform" version="1.0">

!<-- Required to constrain output of rule evaluation -->
<xsl:output method="text" omit-xml-declaration="yes"
    encoding='UTF-8' indent="no" />

!<-- Need this to ensure default text node printing is
      off -->
<xsl:template match="text()"></xsl:template>
