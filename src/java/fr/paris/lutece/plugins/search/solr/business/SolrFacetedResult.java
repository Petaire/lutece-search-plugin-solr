/*
 * Copyright (c) 2002-2014, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.search.solr.business;

import org.apache.solr.client.solrj.response.FacetField;
import org.apache.solr.client.solrj.response.SpellCheckResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 *
 * SolrFacetedResult represents a list of SolrSearchResult
 * with a list of FacetField.
 *
 */
public class SolrFacetedResult
{
    /**Commentaire. **/
    private List<FacetField> facetFieldsList;

    /**Commentaire. **/
    private List<SolrSearchResult> searchResultsList;

    /**Commentaire. **/
    private List<FacetField> facetDateList;

    /**Commentaire. **/
    private Map<String, ArrayList<FacetField>> facetIntersection;
    
    /**spellcheck. **/
    private SpellCheckResponse solrSpellCheckResponse;
    
    private int _nCount;
    
    /**
     * Items count
     * @return items count
     */
    public int getCount( )
    {
    	return _nCount;
    }
    
    /**
     * Items count
     * @param nCount items count
     */
    public void setCount( int nCount )
    {
    	_nCount = nCount;
    }

    /**
     * Return the FacetField List.
     * @return the FacetField List
     */
    public final List<FacetField> getFacetFields(  )
    {
        return facetFieldsList;
    }

    /**
     * Set the FacetField List.
     * @param facetFieldsList the new FacetField List
     */
    public final void setFacetFields( List<FacetField> facetFieldsList )
    {
        this.facetFieldsList = facetFieldsList;
    }

    /**
     * Return the SolrSearchResult List.
     * @return the SolrSearchResult List.
     */
    public final List<SolrSearchResult> getSolrSearchResults(  )
    {
        return searchResultsList;
    }

    /**
     * Set the SolrSearchResult List.
     * @param searchResultsList the new SolrSearchResult List.
     */
    public final void setSolrSearchResults( List<SolrSearchResult> searchResultsList )
    {
        this.searchResultsList = searchResultsList;
    }

    /**
     * Retourne la liste de field de type date.
     * @return Une liste de field
     */
    public final List<FacetField> getFacetDateList(  )
    {
        return facetDateList;
    }

    public final void setFacetDateList( List<FacetField> facetDateList )
    {
        this.facetDateList = facetDateList;
    }

    public final Map<String, ArrayList<FacetField>> getFacetIntersection(  )
    {
        return facetIntersection;
    }

    public final void setFacetIntersection( Map<String, ArrayList<FacetField>> facetIntersection )
    {
        this.facetIntersection = facetIntersection;
    }

	public SpellCheckResponse getSolrSpellCheckResponse() {
		return this.solrSpellCheckResponse;
	}

	public void setSolrSpellCheckResponse(SpellCheckResponse solrSpellCheckResponse) {
		this.solrSpellCheckResponse = solrSpellCheckResponse;
	}
}
