package ca.mcmaster.magarveylab.prism.web;

import java.util.Date;

import ca.mcmaster.magarveylab.prism.orfs.GenePredictionModes;

/**
 * Configuration for a Prism genome search.
 * 
 * @author skinnider
 *
 */
public class PrismConfig {

	/**
	 * Determines whether or not to calculate chemical similarity and genetic
	 * homology scores to known natural products.
	 */
	public boolean score = false;

	/**
	 * Determines whether or not to search a genome with hidden Markov models
	 * for 270 resistance genes.
	 */
	public boolean resistance = false;

	/**
	 * Determines whether or not to search a genome with hidden Markov models
	 * for regulator genes.
	 */
	public boolean regulation = false;

	/**
	 * Determines whether or not so search a genome with hidden Markov models
	 * for ribosomal genes.
	 */
	public boolean ribosomal = false;

	/**
	 * Determines whether or not so search a genome with hidden Markov models
	 * for aminoglycoside genes.
	 */
	public boolean aminoglycoside = false;

	/**
	 * Determines whether or not so search a genome with hidden Markov models
	 * for nucleoside genes.
	 */
	public boolean nucleoside = false;

	/**
	 * Absolute path of the sequence file on which this PRISM search will be
	 * run.
	 */
	public String input = null;

	/**
	 * The maximum allowable distance, in base pairs, between orfs in order to
	 * consider them part of the same cluster
	 */
	public int window = 20_000;

	/**
	 * Universal maximum number of substrates, homologous clusters, BLAST
	 * results, etc. to show in the front end
	 */
	public int display = 5;

	/**
	 * Maximum size of the combinatorial scaffold library.
	 */
	public int scaffoldLimit = 50;

	/**
	 * Minimum Tanimoto coefficient to consider two molecular structures
	 * homologous.
	 */
	public double tanimotoCutoff = 0.8d;

	/**
	 * Minimum homology score to consider two biosynthetic gene clusters
	 * homologous.
	 */
	public double homologyCutoff = 1.5d;

	/**
	 * Absolute path of the root folder. Used by the PRISM jar.
	 * 
	 * @see ca.mcmaster.magarveylab.prism.PrismDesktop PrismDesktop
	 */
	public String root = null;

	/**
	 * Optionally parse a GenBank or FASTA header to determine the genus,
	 * species, and strain of an input genome.
	 */
	public boolean parseorganism = false;

	/**
	 * Optionally output JSON files to a specific folder;
	 */
	public String output = null;

	/**
	 * If set to false, graphical output files and FASTA files will not be
	 * generated.
	 */
	public boolean web = false;

	/**
	 * Optionally enable the detection of 16S sequences, either within GenBank
	 * files or using barrnap.
	 */
	public boolean find16s = false;

	/**
	 * The current version of PRISM. 
	 */
	public String version = "1.2.5-SNAPSHOT";
	
	/**
	 * Date and time at which this configuration was instantiated. 
	 */
	public Date date = new Date();
	
	/**
	 * Determines whether or not open reading frame sequences are saved in the
	 * JSON output from a PRISM run. By default, they are not, due to space
	 * constraints. However, when PRISM is run from the web, this is
	 * automatically enabled.
	 */
	public boolean saveSequences = false;
	
	/**
	 * Sets the method PRISM uses to identify putative open reading frames
	 * within a user-submitted sequence.
	 */
	public GenePredictionModes genePredictionMode = GenePredictionModes.ALL_ORFS;
	
}
